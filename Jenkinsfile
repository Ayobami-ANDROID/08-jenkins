#!/usr/bin/env groovy
library identifier:'jenkins-shared-library@main', retriever: modernSCM(
    [
        $class: 'GitSCMSource',
        remote:'https://github.com/Ayobami-ANDROID/jenkins-shared-library.git',
        credentialsId: 'github-credentials'
    ]
)
def gv
pipeline {
    agent any

    tools {
        maven 'maven-3.9'
    }

    stages {
        stage('init') {
            steps {
                script {
                    gv = load 'script.groovy'
                }
            }
        }
        stage('buildJar') {
            steps {
                script {
                    buildjar()
                }
            }
        }
        stage('build and push image') {
            steps {
                script {
                    buildimage 'aydev123/demo-app:jma3.0'
                    dockerLogin()
                    dockerPush 'aydev123/demo-app:jma3.0'
                }
            }
        }
        stage('deploy') {
            steps {
                script {
                    gv.deployApp()
                }
            }
        }
    }
}
