import requests
from flask import Flask, jsonify

app = Flask(__name__)

@app.route('/')
def home():
    return "Welcome to the MakWigglz GitHub Repo Info Fetcher!"

@app.route('/repo/<owner>/<repo>')
def get_repo_info(owner, repo):
    url = f"https://api.github.com/repos/{owner}/{repo}"
    response = requests.get(url)
    if response.status_code == 200:
        repo_info = response.json()
        return jsonify(repo_info)
    else:
        return jsonify({"error": "Repository not found"}), 404

if __name__ == '__main__':
    app.run(debug=True)
from flask import Flask, jsonify

app = Flask(__name__)

@app.route('/api/flask', methods=['GET'])
def flask_endpoint():
    # Logic here
    return jsonify({"message": "Hello from Flask!"})

if __name__ == '__main__':
    app.run(port=5000)