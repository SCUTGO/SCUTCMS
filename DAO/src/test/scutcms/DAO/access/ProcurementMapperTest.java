package test.scutcms.DAO.access;

import com.scutcms.DAO.access.ProcurementMapper;
import com.scutcms.DAO.entity.Procurement;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2016/7/2 0002.
 */
public class ProcurementMapperTest {
    private ProcurementMapper procurementMapper;
    @Before
    public void setUp() throws Exception {
        procurementMapper=new ProcurementMapper();
    }

    @Test
    public void insertprocurement() throws Exception {
        Procurement procurement=new Procurement();
        procurement.setUsername("asas");
        procurement.setUnit_price(19.2);
        Date date=new Date();
        procurement.setProcureDate(date);
        procurement.setAmount(3123);
        procurement.setProductName("fff");
        procurementMapper.insertprocurement(procurement);
    }

    @Test
    public void updateprocurement() throws Exception {

    }

    @Test
    public void deleteprocurement() throws Exception {
        Procurement procurement=new Procurement();
        procurement.setProductName("fff");
        procurementMapper.deleteprocurement(procurement);
    }

    @Test
    public void getprocurementByproductName() throws Exception {

    }

}