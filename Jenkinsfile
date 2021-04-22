pipeline {
    agent {
        docker {
            image "maven:3.6.0-jdk-8"
            label "docker"
        }
    }

    stages {
        stage("build") {
            steps {
                sh "mvn clean install"
            }
        }
    }

    post {
        always {
            cleanWs()
        }
    }
}