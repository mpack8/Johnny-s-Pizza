// script.js
document.getElementById('loginForm').addEventListener('submit', function(event) {
event.preventDefault(); // Prevent the form from submitting the traditional way

var username = document.getElementById('username').value;
var password = document.getElementById('password').value;

// Simple validation
if (username === 'admin' && password === 'password') {
alert('Welcome!');
} else {
alert('Invalid username or password');
}
});