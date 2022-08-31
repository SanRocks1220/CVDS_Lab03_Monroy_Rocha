package edu.eci.cvds.tdd.registry;
import org.junit.Assert;
import org.junit.Test;
public class RegistryTest {
    private Registry registry = new Registry();
    @Test
    public void validateDeadAge() {
        Person person = new Person();   
        person.setAge(119);
        person.setAlive(true);     
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.DEAD, result);    
    }
    @Test
    public void validateDeadAlive() {
        Person person = new Person();   
        person.setAge(22);
        person.setAlive(false);     
        RegisterResult result = registry.registerVoter(person);        
        Assert.assertEquals(RegisterResult.DEAD, result);    
    }
    @Test
    public void validateUnderage(){
        Person person = new Person();
        person.setAge(17);
        person.setAlive(true);
        RegisterResult result = registry.registerVoter(person);        
        Assert.assertEquals(RegisterResult.UNDERAGE, result);
    }
    @Test
    public void INVALID_AGE1() {
        Person person = new Person();   
        person.setAge(-20);
        person.setAlive(true);     
        RegisterResult result = registry.registerVoter(person);        
        Assert.assertEquals(RegisterResult.INVALID_AGE, result);    
    }
    @Test
    public void INVALID_AGE2() {
        Person person = new Person();   
        person.setAge(1000);
        person.setAlive(true);     
        RegisterResult result = registry.registerVoter(person);        
        Assert.assertEquals(RegisterResult.INVALID_AGE, result);    
    }
    @Test
    public void validateRegistryResult() {        
        Person person = new Person();
        person.setAge(18);
        person.setAlive(true);
        RegisterResult result = registry.registerVoter(person);        
        Assert.assertEquals(RegisterResult.VALID, result);
    }

}