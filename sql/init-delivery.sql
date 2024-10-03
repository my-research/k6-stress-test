CREATE TABLE IF NOT EXISTS deliveries (
  id INT AUTO_INCREMENT PRIMARY KEY,
  delivery_name VARCHAR(255) NOT NULL,
  delivery_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS stocks (
  id INT AUTO_INCREMENT PRIMARY KEY,
  productId INT NOT NULL,
  quantity INT NOT NULL
);

INSERT INTO stocks (productId, quantity) VALUES (1, 100);
