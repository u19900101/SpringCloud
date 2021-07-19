package ppppp.service;

/**
 * @author pppppp
 * @date 2021/7/18 17:06
 */
public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}
