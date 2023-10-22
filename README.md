# AED_Coursera_Platform
AED project to the Design and implementation of an alternative Coursera platform

**Commands to Push Code**

# Initialize a new Git repository in the current directory.
git init

# Add a remote repository named "origin" with the provided URL.
git remote add origin https://github.com/VAmbre3/AED_Coursera_Platform.git

# Switch to the 'Vasudha' branch. (Note: If the branch doesn't exist locally, it will give an error)
git checkout Vasudha

# Fetch the 'Vasudha' branch from the remote repository and create a local branch named 'Vasudha' that tracks the remote branch.
git fetch origin Vasudha:Vasudha

# Switch to the local 'Vasudha' branch.
git checkout Vasudha

# Stage all changes in the working directory for the next commit.
git add .

# Commit the staged changes with a descriptive message.
git commit -m "Your commit message here"

# Push the committed changes to the 'Vasudha' branch of the remote repository named 'origin'.
git push origin Vasudha
