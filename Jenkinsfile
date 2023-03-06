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
                sh 'mvn -B -DskipTests install'
                sh 'mvn -B -DskipTests clean package'

            }
        }
        stage ('Docker'){
            steps {
                sh 'docker build -t $JOB_NAME .'
                }
        }
    }
}