#!/usr/bin/env groovy
@library('jenkins-shared-library')
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
        stage('build image') {
            steps {
                script {
                     buildimage()
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
