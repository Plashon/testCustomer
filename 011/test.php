<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Form Result</title>
</head>
<body>
    <?php
    // Check if form is submitted
    if ($_SERVER["REQUEST_METHOD"] == "POST") {
        // Retrieve form data
        $firstName = $_POST["firstName"];
        $lastName = $_POST["lastName"];
        $age = $_POST["age"];
        
        // Display the form data
        echo "<h2>Form Result:</h2>";
        echo "<p id = 'firstname'><strong>First Name:</strong>$firstName</p>";
        echo "<p><strong>Last Name:</strong> $lastName</p>";
        echo "<p><strong>Age:</strong> $age</p>";
    } else {
        // If form is not submitted, display a message
        echo "<p>No form data submitted.</p>";
    }
    ?>
</body>
</html>
