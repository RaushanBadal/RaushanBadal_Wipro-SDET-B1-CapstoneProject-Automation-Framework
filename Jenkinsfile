pipeline {

    agent any

    tools {
        jdk 'JDK25'
        maven 'Maven3'
    }

    stages {

        stage('Checkout') {
            steps {
                echo 'Checking out GUI Automation Framework source code...'
            }
        }

        stage('Build') {
            steps {
                echo 'Building Maven Project...'
                bat 'mvn clean compile'
            }
        }

        stage('Execute Tests') {
            steps {
                echo 'Executing TestNG Test Suite...'
                bat 'mvn test'
            }
        }

        stage('Generate Reports') {
            steps {
                echo 'Extent Report generated successfully.'
            }
        }
    }

    post {

        success {
            echo 'GUI Automation Framework executed successfully.'
            echo 'All tests passed.'
        }

        failure {
            echo 'Build failed. Please check Jenkins Console Output.'
        }

        always {
            echo 'Pipeline execution completed.'
        }
    }
}