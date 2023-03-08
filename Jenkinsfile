env.DOCKER_HOST = 'tcp://192.168.1.5:2375'

pipeline {
    agent any
    stages {
        stage('Build') { 
            agent {
                docker {
                    image 'maven:3.9.0-amazoncorretto-17' 
                    args '-v /root/.m2:/root/.m2' 
                }
            }
            steps {
                sh 'mvn -B -DskipTests clean package'

            }
        }
        stage ('Docker build'){
            steps {
                script{
                    def version = sh(script: 'mvn help:evaluate -Dexpression=project.version -q -DforceStdout', returnStdout: true).trim()
                    def name = sh(script: 'mvn help:evaluate -Dexpression=project.name -q -DforceStdout', returnStdout: true).trim()
                    def app = docker.build("${name}:${version}", '.')
                    docker.image("${name}:${version}").run("-p 8083:8080 --name ${name}")
                }
            }
        }

        stage ('Test'){
            steps {
                script{
                    sh 'docker run ${name}:${version} mvn test'
                    def testResult = sh(returnStatus: true, script: 'docker ps -aqf name="${name}" | xargs docker inspect --format="{{.State.ExitCode}}"').trim()
                    if (testResult != 0) {
                        emailext (
                        subject: "Test fallidos para ${name}",
                        body: "Test fallidos para ${name} en la version ${version}",
                        to: "ivan.duart93@gmail.com",
                        replyTo: "ivan.duart93@gmail.com",
                        mimeType: 'text/plain',
                        attachLog: true,
                        compressLog: true
                    )
                    }
                }
            }
        }
    }
}