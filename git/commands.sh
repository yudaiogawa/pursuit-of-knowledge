
#### commit ################################################################

# Commit Author 修正
git commit --amend --author="username <account@domain.name>"

#### log ###################################################################

# Author と Commiter 確認
git log --pretty=fuller

#### filter-branch #########################################################

# 全コミットの Author と Commiter 書き換える
git filter-branch -f --env-filter "GIT_AUTHOR_NAME='username'; GIT_AUTHOR_EMAIL='email'; GIT_COMMITTER_NAME='username'; GIT_COMMITTER_EMAIL='email';" HEAD

#### cherry-pick ###########################################################

# 特定のコミットだけを取り込めちゃう
git cherry-pick SHA

#### rebase ################################################################

# 指定コミットにリベースできる
# コミットメッセージ変更、コミットをまとめたりできる
git rebase -i SHA
