def call() {
    stage('junit'){
        junit '**/target/surefire-reports/TEST-*.xml'
    }
}