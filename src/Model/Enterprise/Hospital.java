/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Enterprise;

import Model.Region.Region;
import Model.Profile.Role;
import java.util.ArrayList;

/**
 *
 * @author nehadevarapalli
 */
public class Hospital extends Enterprise {
    
    public Hospital(String name,Region network){
        super(name,Enterprise.EnterpriseType.Hospital, network);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
