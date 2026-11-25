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
                    echo "Executing pipeline for branch $BRANCH_NAME"
                }
            }
        }
        stage('test') {
            steps {
                script {
                    echo 'Testing the application....'
                    echo "Executing pipeline for branch $BRANCH_NAME"
                }
            }
        }
        stage('build') {
          
            steps {
                script {
                    echo "Building the application...."
                }
            }
        }
        stage('deploy') {
            
            steps {
                script {
                    echo "Deploying the application...."
                }
            }
        }

    }
}
