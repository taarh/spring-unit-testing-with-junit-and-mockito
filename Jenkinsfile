pipeline {
    agent {
        docker {
        image "maven:3.6.0-jdk-13"
        }
    }

    stages {
        stage("TEST") {
                    steps {
                        sh "mvn -version"
                        sh "mvn test"
                    }
                }
        stage("Build") {
            steps {
                sh "mvn -version"
                sh "mvn clean install"
            }
        }
    }
}