
#### commit ################################################################

# Modify the commit author.
git commit --amend --author="username <account@domain.name>"

#### stash #################################################################

# Checking diff of stashed file.
git stash show -p stash_name

#### log ###################################################################

# Checking Author and Commiter.
git log --pretty=fuller

#### filter-branch #########################################################

# Rewrite author and commiter of all commits.
git filter-branch -f --env-filter "GIT_AUTHOR_NAME='username'; GIT_AUTHOR_EMAIL='email'; GIT_COMMITTER_NAME='username'; GIT_COMMITTER_EMAIL='email';" HEAD

#### cherry-pick ###########################################################

# Apply a specific commit.
git cherry-pick SHA

#### rebase ################################################################

# Rebase a specific commit.
# You can change the commit message and so on.
git rebase -i SHA
