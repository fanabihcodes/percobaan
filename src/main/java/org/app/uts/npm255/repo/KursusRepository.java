/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.app.uts.npm255.repo;

import org.app.uts.npm255.model.Kursus;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ADE
 */
public interface KursusRepository extends JpaRepository<Kursus, String>{
    
}
