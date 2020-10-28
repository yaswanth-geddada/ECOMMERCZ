package com.ecz.leave;


import java.util.List;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;




interface LeaveDAO {
    @SqlQuery("SELECT * FROM LEAVE_TABLE")
    @Mapper(LeaveMapper.class)
    List<Leave> leaveList();


    @SqlUpdate("Insert into LEAVE_TABLE(Leave_ID,START_DATE,END_DATE,LEAVE_TYPE,REASON,STATUS,APPLIED_ON) values(:leaveId,:startDate,:endDate,:leaveType,:reason,:status,:AppliedOn)")
    int insertLeave(@Bind("leaveId") String leaveId,
    @Bind("startDate") String startDate ,
    @Bind("endDate") String endDate,
    
    @Bind("leaveType")String leaveType,
    @Bind("reason")String reason,
    @Bind("status")String status,
    @Bind("AppliedOn")String AppliedOn);

    
}


