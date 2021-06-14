add dependency in pom.xml:

<!--        <dependency>
            <groupId>org.mybatis.spring.boot</groupId>
            <artifactId>mybatis-spring-boot-starter</artifactId>
            <version>1.3.2</version>
        </dependency>-->


unzip the transaction.7z


the related sqls:

/*
CREATE TABLE `student`
        (
        `id`       int(11) NOT NULL AUTO_INCREMENT,
        `realname` varchar(255) DEFAULT NULL,
        PRIMARY KEY (`id`)
        ) ENGINE=InnoDB DEFAULT CHARSET=utf8;

        CREATE TABLE `course`
        (
        `id`          int(11) NOT NULL AUTO_INCREMENT,
        `course_name` varchar(64) DEFAULT NULL,
        `number`      int(11) DEFAULT NULL,
        PRIMARY KEY (`id`)
        ) ENGINE=InnoDB DEFAULT CHARSET=utf8;

        CREATE TABLE `student_course`
        (
        `student_id` int(11) NOT NULL,
        `course_id`  int(11) NOT NULL
        ) ENGINE=InnoDB DEFAULT CHARSET=utf8;

        CREATE TABLE `card`
        (
        `id`         int(11) NOT NULL AUTO_INCREMENT,
        `student_id` int(11) DEFAULT NULL,
        `balance`    int(11) DEFAULT NULL,
        PRIMARY KEY (`id`)
        ) ENGINE=InnoDB DEFAULT CHARSET=utf*/
