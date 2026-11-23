def buildJar() {
    echo 'building the application...'
    sh 'mvn package'
}

def buildImage() {
    echo 'building the docker image....'
    sh 'mvn package'

    withCredentials([
                    usernamePassword(credentialsId:'docker-hub-repo', passwordVariable:'PASS', usernameVariable:'USER')
                   ]) {
        sh 'docker build -t aydev123/demo-app:jma2.0 .'
        sh 'echo $PASS | docker login -u $USER --password-stdin'
        sh 'docker push aydev123/demo-app:jma2.0'
    }
}

def deployApp() {
    echo 'deploying the application...'
}
return this
