package org.fj;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.fj.mapper.UserMapper;
import org.fj.model.User;
import org.fj.utils.MyBatisUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        SqlSessionFactory sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();
        try (SqlSession session = sqlSessionFactory.openSession()) {

            UserMapper mapper = session.getMapper(UserMapper.class);

            // Criar usuário
            User newUser = new User();
            newUser.setName("João Silva");
            newUser.setEmail("joao@example.com");
//            mapper.insert(newUser);
//            session.commit();
//            System.out.println("Usuário criado com ID: " + newUser.getId());

            // Buscar todos os usuários
            List<User> users = mapper.findAll();
            System.out.println("\nTodos os usuários:");
            users.forEach(System.out::println);

//            // Atualizar usuário
//            User userToUpdate = mapper.findById(newUser.getId());
//            userToUpdate.setEmail("joao.novo@example.com");
//            mapper.update(userToUpdate);
//            session.commit();
//            System.out.println("\nUsuário após atualização:");
//            System.out.println(mapper.findById(userToUpdate.getId()));

//            // Deletar usuário
//            mapper.delete(userToUpdate.getId());
//            session.commit();
//            System.out.println("\nUsuários após deleção:");
//            mapper.findAll().forEach(System.out::println);
        }
    }
}
