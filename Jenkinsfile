pipeline {
    agent any

    tools {
        maven 'maven-3.9'
    }

    stages {
        stage('init') {
            steps {
                script {
                    echo 'Testing the application....'
                    echo 'Executing pipeline for branch'
                }
            }
        }
        stage('test') {
            steps {
                script {
                    echo 'Testing the application....'
                }
            }
        }
        stage('build') {
            steps {
                script {
                    echo 'Building the application....'
                }
            }
        }
        stage('deploy') {
            steps {
                script {
                    echo 'Deploying the application....'
                }
            }
        }
    }
}
