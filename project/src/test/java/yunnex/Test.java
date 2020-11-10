package yunnex;

import yunnex.member.Card;
import yunnex.shop.ShopInfo;

/**
 * @author suchuantao
 * @Title ${file_name}
 * @Type
 * @Package
 * @Description ${todo}
 * @date 2020/10/26 16:20
 */



public class Test {
    public static void main(String[] args) throws Exception {
        //创建商户信息实例
        ShopInfo shopInfo = new ShopInfo();
        //商户登录
        shopInfo.login();


//        //创建会员信息实例
//        Thread.sleep(2000);
//        FindMember member=new FindMember();
//
//        //查询商户下所有会员信息
//        Thread.sleep(2000);
//        member.findMemberList();
//
//        //根据手机号查询会员信息
//       Thread.sleep(2000);
//       Map<String,Integer> map3=  member.findPhoneNumberMemberInfo();
//        //商户后台手动增加会员积分
//        Thread.sleep(2000);
//       member.shopIncreaseIntegral(map3);
//
//        //根据手机号查询会员信息
//        Thread.sleep(5000);
//        Map<String,Integer> map4=  member.findPhoneNumberMemberInfo();
//        //商户后台手动扣减会员积分
//        Thread.sleep(3000);
//        member.shopDeductionntegral(map4);
//
//        //查询近30天会员余额变动记录
//        Thread.sleep(2000);
//        member.FindBalanceRecords();
//        //根据手机号查询会员详情页
//        Thread.sleep(2000);
//        member.findMemberInfo();
//        //查询近30天会员积分变动记录
//        Thread.sleep(2000);
//        member.findMemberBonusRecords();
//
//
//        //创建会员修改实例
//        ModifyMember modifyMember=new ModifyMember();
//        //获取会员默认账户本金和赠送金额
//        Thread.sleep(2000);
//        Map<String,Integer> map = modifyMember.memberDetail();
//        //商户后台增加会员余额
//        Thread.sleep(2000);
//        modifyMember.increaseMemberBalance(map);
//
//        //获取会员默认账户本金和赠送金额
//        Thread.sleep(2000);
//        Map<String,Integer> map2 = modifyMember.memberDetail();
//        //商户后台扣减会员余额
//        Thread.sleep(5000);
//        modifyMember.increaseMemberBalanceDeduction(map2);
//
//        //创建会员消费与充值实例
//        MemberConsumption memberConsumption = new MemberConsumption();
//        //POS机登录
//        Thread.sleep(2000);
//        String token = memberConsumption.posLogin();
//
//        //pos机会员充值，第一步获取到充值订单
//        Thread.sleep(2000);
//        String orderId= memberConsumption.getMemberPosRechargeOrder(token);
//       //pos机会员充值，第二步确认充值
//        Thread.sleep(2000);
//        memberConsumption.confirmCash(token,orderId);
//
//       //pos机查询会员主页
//        Thread.sleep(2000);
//        memberConsumption.findPosMemberInfo(token);
//
//        //pos机手动增加积分
//        Thread.sleep(2000);
//        memberConsumption.posMemberIncreaseIntegral(token);
//
//        //pos机手动扣减积分
//        Thread.sleep(2000);
//        memberConsumption.posMemberDeductionIntegral(token);
//
//
//        //pos机会员消费-pos机会员储值账户验证手机号,第一步，发起支付
//       String orderid= memberConsumption.posMemberStoredValueInitiatePayment(token);
//        Thread.sleep(2000);
//       //pos机会员消费-pos机会员储值账户验证手机号,第二步，确认支付，验证手机号，储值账户密码
//        Thread.sleep(2000);
//       memberConsumption.posMemberStoredValueConfirmPayment(token,orderid);
//
//       //查询pos端卡券列表，返回serial
//        Thread.sleep(2000);
//        Map<String,String> mapserial= memberConsumption.posConsumList(token);
//        //pos端卡券中心领取优惠券
//        Thread.sleep(2000);
//        memberConsumption.posCollectCoupons(mapserial,token);
//
//        //创建WechatOperation实例
//        WechatOperation wechatOperation = new WechatOperation();
//        //查询微信端会员主页
//        wechatOperation.wectchMemberHomepage();
//        //查询微信端会员余额变动记录
//        wechatOperation.wectchAccountBalanceRecord();
//        //查询微信端会员积分变动记录
//        wechatOperation.findWectchIntegralRecord();
//        //查询微信端卡券中心
//        wechatOperation.findWectchCardVoucherCenter();
//        //微信端卡券中心领券
//        String code= wechatOperation.WectchCardVoucherCenterReceive();
//        //po机扫一扫核销优惠券
//        memberConsumption.poscardCardcouponVerify(code,token);
//
//
//        //会员主页-进入积分商城
//        wechatOperation.activityList();
//       //积分兑换
//        String attach=wechatOperation.activityExchange();
//
//        //智慧餐厅-创建购物车
//        wechatOperation.zhct_shopping_cart();
//        //提交订单获取礼品券可用优惠,返回couponIds和codeList
//        //智慧餐厅查询购物车
//        wechatOperation.query_shopping_card();
//        //智慧餐厅~获取最佳优惠
//        Map<String,Long> mapzhct = wechatOperation.smart_shop_bestBenefit();
//        //智慧餐厅获取17单号
//        String orderId17 = wechatOperation.get_order17(mapzhct);
//        //智慧餐厅获取20单号
//        String orderId20 = wechatOperation.get20danhao(orderId17);
//        //智慧餐厅使用储值卡支付
//        wechatOperation.zhct_czkzf(orderId20);
//        //智慧餐厅确认支付
//        wechatOperation.zhcychzhPayconfirm(mapzhct, orderId20);


        Card card=new Card();
        //创建礼品卡-保存未上架
        card.creadStoredCard();





    }
}
