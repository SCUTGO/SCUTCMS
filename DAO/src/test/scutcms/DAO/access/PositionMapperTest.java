package test.scutcms.DAO.access;

import com.scutcms.DAO.access.PositionMapper;
import com.scutcms.DAO.entity.Position;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2016/7/2 0002.
 */
public class PositionMapperTest {
    private PositionMapper positionMapper;
    @Before
    public void setUp() throws Exception {
        positionMapper=new PositionMapper();
    }

    @Test
    public void insert() throws Exception {
        Position position=new Position();
        position.setPunishment(12);
        position.setWageHourly(12);
        position.setBaseSalary(123);
        position.setPositionName("cook");
        positionMapper.insert(position);
    }

    @Test
    public void update() throws Exception {

    }

    @Test
    public void delete() throws Exception {
        Position position=new Position();
        position.setPositionName("cook");
        positionMapper.delete(position);
    }

    @Test
    public void getPositionByPositionName() throws Exception {

    }

}