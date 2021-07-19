package ppppp.service.impl;

/**
 * @author pppppp
 * @date 2021/7/18 17:07
 */

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import ppppp.dao.StorageDao;
import ppppp.service.StorageService;

import javax.annotation.Resource;

@Service
@Slf4j
public class StorageServiceImpl  implements StorageService {
    private static final Logger LOGGER = LoggerFactory.getLogger(StorageServiceImpl.class);

    @Resource
    private StorageDao storageDao;

    /**
     * 扣减库存
     */
    @Override
    public void decrease(Long productId, Integer count) {
        LOGGER.info("------->storage-service中扣减库存开始");
        storageDao.decrease(productId,count);
        LOGGER.info("------->storage-service中扣减库存结束");
    }
}
