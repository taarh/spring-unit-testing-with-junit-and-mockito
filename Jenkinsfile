pipeline {
    agent {
        docker {
        image "maven:3.6.0-jdk-13"
        }
    }

    stages {
        stage("BUILD") {
                    steps {
                        sh "mvn -version"
                        sh "mvn compile"
                    }
                }
        stage("TEST") {
            steps {
                sh "mvn -version"
                sh "mvn test "
            }
        }
    }
}