// Dashboard.jsx
import React from "react";
import "./styles.css";

function Dashboard({ username }) {
  return (
    <div className="dashboard-container">
      <h1>Hello {username},</h1>
      <h2>Welcome to KodNest Dashboard!</h2>
      <p className="dashboard-text">
        You have successfully logged in.
        This is your dashboard page.
      </p>

      <div className="dashboard-box">
        <h3>Your profile summary</h3>
        <p><strong>Username: </strong>{username}</p>
        <p><strong>Status: </strong>Looged In</p>
      </div>
    </div>
  );
}

export default Dashboard;