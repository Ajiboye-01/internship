HNG Stage One Task
A basic REST API created using Java that provides personal details such as email, the current date and time in ISO 8601 format, and the URL to a GitHub repository.

Requirements
Java 17 and above
Local Development Setup
Clone the repository
git clone https://github.com/Ajiboye-01/internship.git cd your-repo
Start the development server

The API will be available at http://localhost:8080

API Documentation
Endpoint: /api/info
Method: GET
Response Format: JSON
Response Format
{ "email": "aariyo111@gmail.com", "current_datetime": "2025-01-30T09:30:00Z", "https://github.com/Ajiboye-01/internship.git" }

backlink
Visit: https://hng.tech/hire/java-developers for experienced Java developer

Production Setup
To start the server in production:

Deployment
This API is deployed using Render/Railway

Render
Create a new Web Service
Connect your GitHub repository
Set build command: 
Set start command: 

Environment Variables
PORT: Server port (default: 8080)
Technologies Used
java
CORS middleware
Live Demo
The API is deployed at: https://hng12-0-production-4048.up.railway.app

Author
Ajiboye
