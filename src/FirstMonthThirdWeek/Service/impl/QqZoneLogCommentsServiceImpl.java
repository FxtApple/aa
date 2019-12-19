package Service.impl;

import DAO.QqZoneLogCommentsDao;
import POJO.QqZoneLogComments;
import Service.QqZoneLogCommentsService;

import java.util.List;

public class QqZoneLogCommentsServiceImpl implements QqZoneLogCommentsService {
    QqZoneLogCommentsDao qqZoneLogCommentsDao;
    public QqZoneLogCommentsServiceImpl(){qqZoneLogCommentsDao = new QqZoneLogCommentsDao();}

    /**
     * 增加
     * */
    @Override
    public Integer addQqZoneComments(QqZoneLogComments qqZoneComments) {
        return qqZoneLogCommentsDao.addQqZoneComments(qqZoneComments);
    }

    /**
     * 删除:根据写评论人id删除记录
     * */
    @Override
    public Integer deleteQqZoneComments(int id) {
        return qqZoneLogCommentsDao.deleteQqZoneComments(id);
    }

    /**
     * 修改：根据评论人id修改评论
     * */
    @Override
    public Integer updateQqZoneLogComments(int writerId, String comments) {
        return qqZoneLogCommentsDao.updateQqZoneLogComments(writerId,comments);
    }

    /**
     * 查询:根据评论人id查询
     * */
    @Override
    public List<QqZoneLogComments> selectQqZoneLogComments(int writerId) {
        return qqZoneLogCommentsDao.selectQqZoneLogComments(writerId);
    }
}
