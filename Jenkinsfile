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
    }
}