pipeline {
    agent {
        docker {
            image 'maven:3.9.0-amazoncorretto-17' 
            args '-v /root/.m2:/root/.m2' 
        }
    }
    stages {
        stage('Build') { 
            steps {
                sh 'mvn -B -DskipTests clean package' 
            }
        }
    }
}