/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.Task;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author MK
 */
@Remote
public interface TaskServiceRemote {

    Task createTask(String taskText);
    List<Task> getAllTodos();
    
}
