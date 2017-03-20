-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema SportEquipmentShop
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema SportEquipmentShop
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `SportEquipmentShop` DEFAULT CHARACTER SET utf8 ;
USE `SportEquipmentShop` ;

-- -----------------------------------------------------
-- Table `SportEquipmentShop`.`user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SportEquipmentShop`.`user` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `login` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `user_login_UNIQUE` (`login` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SportEquipmentShop`.`equipment`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SportEquipmentShop`.`equipment` (
  `id` INT UNSIGNED NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `cost` DOUBLE NOT NULL,
  `price` DOUBLE NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SportEquipmentShop`.`order`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SportEquipmentShop`.`order` (
  `id` INT UNSIGNED NOT NULL,
  `date` DATETIME NOT NULL,
  `is_open` TINYINT(1) NOT NULL,
  `equipment_id` INT UNSIGNED NOT NULL,
  `user_id` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`id`, `equipment_id`, `user_id`),
  UNIQUE INDEX `id_order_UNIQUE` (`id` ASC),
  INDEX `fk_order_equipment_idx` (`equipment_id` ASC),
  INDEX `fk_order_user1_idx` (`user_id` ASC),
  CONSTRAINT `fk_order_equipment`
    FOREIGN KEY (`equipment_id`)
    REFERENCES `SportEquipmentShop`.`equipment` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_order_user1`
    FOREIGN KEY (`user_id`)
    REFERENCES `SportEquipmentShop`.`user` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `SportEquipmentShop`.`equipment`
-- -----------------------------------------------------
START TRANSACTION;
USE `SportEquipmentShop`;
INSERT INTO `SportEquipmentShop`.`equipment` (`id`, `name`, `cost`, `price`) VALUES (1, 'Rollers', 150, 10);
INSERT INTO `SportEquipmentShop`.`equipment` (`id`, `name`, `cost`, `price`) VALUES (2, 'Skateboard', 100, 8);

COMMIT;

