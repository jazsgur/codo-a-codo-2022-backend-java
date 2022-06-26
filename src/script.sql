CREATE TABLE `producto` (
	`id` INT(10) NOT NULL AUTO_INCREMENT,
	`nombre` VARCHAR(50) NOT NULL COLLATE 'utf8mb4_0900_ai_ci',
	`precio` FLOAT NOT NULL,
	`fecha_creacion` DATE NOT NULL,
	`imagen` VARCHAR(100) NULL DEFAULT NULL COLLATE 'utf8mb4_0900_ai_ci',
	`codigo` VARCHAR(7) NOT NULL COLLATE 'utf8mb4_0900_ai_ci',
	PRIMARY KEY (`id`) USING BTREE,
	UNIQUE INDEX `codigo` (`codigo`) USING BTREE
)