CREATE TABLE users(user_id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
                  username VARCHAR(10) NOT NULL,
                  name  VARCHAR(20) NOT NULL,
                  email VARCHAR(50) NOT NULL,
                  rank INT DEFAULT 0,
                  active BOOLEAN DEFAULT true,
                  created_on TIMESTAMP AS CURRENT_TIMESTAMP NOT NULL);

INSERT INTO users(username, name, email) VALUE ('user1', 'John Test', 'some@email.com');
INSERT INTO users(username, name, email) VALUE ('user2','Paul Test','paul@emmail.com');