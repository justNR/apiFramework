pipeline {
    agent any

    tools {
        maven "3.6.0"
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