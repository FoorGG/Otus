final String gitBranchName = env.GIT_BRACNCH;
final String sshPubKey = sh (script:"cat ~/.ssh/id_rsa.pub")

pipeline {
    agent any
    options {
        timeout(time: 20, unit: 'MINUTES')
    }
    stages {
        stage('Downloading Reppo'){
            sh(script:"echo ${sshPubKey}")
        }
//        stage('Checkout Playbook'){
//
//        }
    }
}