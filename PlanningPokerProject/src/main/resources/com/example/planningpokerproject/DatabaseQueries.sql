CREATE DATABASE planningpoker;
USE planningpoker;

CREATE TABLE `planningpoker`.`users` (
  `userId` INT NOT NULL,
  `Username` VARCHAR(45) NOT NULL,
  `Password` VARCHAR(45) NOT NULL,
  `Designation` VARCHAR(45) NOT NULL,
  `Priority` INT NOT NULL,
  UNIQUE INDEX `userId_UNIQUE` (`userId` ASC) VISIBLE,
  UNIQUE INDEX `Username_UNIQUE` (`Username` ASC) VISIBLE,
  PRIMARY KEY (`userId`));
  
INSERT INTO `planningpoker`.`users` (`userId`, `Username`, `Password`, `Designation`, `Priority`)
VALUES (1, 'john_doe', 'password123', 'Developer', 1);

INSERT INTO `planningpoker`.`users` (`userId`, `Username`, `Password`, `Designation`, `Priority`)
VALUES (2, 'jane_smith', 'securepass', 'Product Manager', 2);

INSERT INTO `planningpoker`.`users` (`userId`, `Username`, `Password`, `Designation`, `Priority`)
VALUES (3, 'bob_jones', 'pass123', 'Tester', 3);



