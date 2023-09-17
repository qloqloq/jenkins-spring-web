pipeline {
    agent any

    stages {
        stage('Clean') {
            steps {
                sh "gradle clean"
            }
        }
        stage('Assemble') {
            steps {
                sh "gradle assemble"
            }
        }
        stage('Test') {
            steps {
                sh "gradle test"
            }
        }
        stage('Fat jar') {
            steps {
                sh "gradle bootJar"
            }
        }
    }
}
