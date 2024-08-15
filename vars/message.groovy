def call(String branchName, String repoUrl, String credentials) {
    script {
        git branch: "${branchName}", url: "${repoUrl}", credentialsId: "${credentials}"
    }
}
