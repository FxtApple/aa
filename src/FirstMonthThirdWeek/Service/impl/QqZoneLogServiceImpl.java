package Service.impl;

import DAO.QqZoneLogDao;
import POJO.QqZoneLog;
import Service.QqZoneLogService;

import java.util.List;

public class QqZoneLogServiceImpl implements QqZoneLogService {
    QqZoneLogDao qqZoneLogDao;
    public QqZoneLogServiceImpl(){qqZoneLogDao = new QqZoneLogDao();}

    /**
     *增加
     * */
    @Override
    public Integer addQqZoneLog(QqZoneLog qqZoneLog) {
        return qqZoneLogDao.addQqZoneLog(qqZoneLog);
    }

    /**
     *删除:根据id删除空间日志
     * */
    @Override
    public Integer deleteQqZoneLog(int id) {
        return qqZoneLogDao.deleteQqZoneLog(id);
    }

    /**
     *修改:根据id修改空间日志标题
     * */
    @Override
    public Integer updateQqZoneLog(QqZoneLog qqZoneLog, int id) {
        return qqZoneLogDao.updateQqZoneLog(qqZoneLog,id);
    }

    /**
     *查询:根据标题查询
     * */
    @Override
    public List<QqZoneLog> selectQqZoneLog(QqZoneLog qqZoneLog) {
        return qqZoneLogDao.selectQqZoneLog(qqZoneLog);
    }
}
