pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "G8"
    }

    stages {
        stage('Build') {
            steps {
                sh "gradle clean classes"
            }
        }
        stage('Test') {
            steps {
                sh "gradle test"
            }
        }
//        stage('Deploy') {
//            steps {
//                sh "gradle test"
//            }
//        }
    }
}
