package com.jia.xunfeidemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;

public class SelectableTextViewActivity extends AppCompatActivity {

    private SelectedTextView et;

    private static final String text = "<div class=\"BlogContent\"><p><span style=\"font-size: 14px;\"><strong>各位 OSCer 大家壕，周二了，你们的周一综合症好了吧，没借口偷懒了吧，赶紧上班去吧！很多少人羡慕着你们呢</strong></span></p><p><span style=\"font-size: 14px;\"></span></p><p><a href=\"http://my.oschina.net/u/1756518\" target=\"_blank\" rel=\"nofollow\">@西夏一品堂</a><span style=\"font-size: 14px;\">：每天看你们发说说，我都好羡慕 。你们长得又好看 ，还用智能手机，又有钱 &nbsp;\n" +
            "，整天讨论一些好像很厉害的东西。随便拿个东西都顶我几个月的生活费，我读书少，又是乡下来的，没见过多少世面，所以我只能默默的看着你发，时不时点个赞\n" +
            " , 这样好像可以假装和你们很熟 ，真的 ，心好累 ，好了不说了 ，别人催我把手机还给他，我要去喂猪了&nbsp;\t </span></p><p style=\"color:red\"><font color=\"#00bbaa\"><span style=\"font-size: 14px;\"><strong><strong>这位盆友，你真是来送温暖啊，说得我们这些搬砖的好像很幸福的样子，</strong></strong></span></p><p><a href=\"http://static.oschina.net/uploads/space/2015/0720/172817_huYO_2359467.jpg\" target=\"_blank\"><img title=\"\" src=\"http://static.oschina.net/uploads/space/2015/0720/172817_huYO_2359467.jpg\" height=\"197\" width=\"250\" style=\"cursor: pointer;\"></a></p><p><span style=\"font-size: 14px;\"><strong>上班路上还打醒精神，如今江湖险恶，到处都是坏人。。</strong></span></p><p><span style=\"font-size: 14px;\"></span><a href=\"http://my.oschina.net/u/1421895\" target=\"_blank\" rel=\"nofollow\">@everlxq</a><span style=\"font-size: 14px;\">：在街上经常会遇到偷偷问你要不要手机的，现在太可怕了，直接明目张胆推销人体器官了，刚才走路无意碰了一女的，还没来得及说对不起，那女的竟然大声问我要不要脸！&nbsp;\t </span></p><p><span style=\"font-size: 14px;\"></span></p><p><a href=\"http://my.oschina.net/u/1397000\" target=\"_blank\" rel=\"nofollow\">@Sonnet</a><span style=\"font-size: 14px;\">：如果你今天在深圳固戍地铁站看到有个人晕倒了，没错，就是我，妈蛋，一个扶的人都没有... <br></span></p><p><span style=\"font-size: 14px;\"><strong>这不能怪别人，可能你看起来像80岁，人家不敢扶。如果你是小孩纸就不同了</strong></span></p><p><a href=\"http://my.oschina.net/blindcat\" target=\"_blank\" rel=\"nofollow\">@blindcat</a><span style=\"font-size: 14px;\">：这兔子忒坏了</span></p><p><a href=\"http://static.oschina.net/uploads/space/2015/0720/160557_Bw9o_31384.gif\" target=\"_blank\"><img title=\"\" alt=\"http://static.oschina.net/uploads/space/2015/0720/160557_Bw9o_31384.gif\" src=\"http://static.oschina.net/uploads/space/2015/0720/160557_Bw9o_31384.gif\" height=\"175\" width=\"280\" style=\"cursor: pointer;\"></a></p><p><a href=\"http://my.oschina.net/riaway\" target=\"_blank\" rel=\"nofollow\">@OSC首席捣蛋侠</a><span style=\"font-size: 14px;\">：下身穿的红色开源内裤，上身穿的白色开源T恤。好凉爽的感觉 <br></span></p><p><a href=\"http://my.oschina.net/fengxh\" target=\"_blank\" rel=\"nofollow\">@奋斗的麻雀</a><span style=\"font-size: 14px;\">：办公室冷的受不了&nbsp;\t <br></span></p><p><a href=\"http://my.oschina.net/oscfox\" target=\"_blank\" rel=\"nofollow\">@Yashin</a><span style=\"font-size: 14px;\">：公司这冷气，快是时候考虑穿秋裤了&nbsp;\t <br></span></p><p><span style=\"font-size: 14px;\"><strong>不开空调嫌热，开了空调又怕冷，算了，自己种一台风扇吧</strong></span></p><p><a href=\"http://static.oschina.net/uploads/space/2015/0720/172817_3dT8_2359467.jpg\" target=\"_blank\"><img title=\"\" src=\"http://static.oschina.net/uploads/space/2015/0720/172817_3dT8_2359467.jpg\" height=\"357\" width=\"300\" style=\"cursor: pointer;\"></a></p><p><span style=\"font-size: 14px;\"><strong>投诉完公司，下来就该吐槽下领导了</strong></span></p><p><a href=\"http://my.oschina.net/u/2315272\" target=\"_blank\" rel=\"nofollow\">@VNC</a><span style=\"font-size: 14px;\">：碰到领导偷看员工QQ聊天记录，我TM真想骂街 <br></span></p><p><span style=\"font-size: 14px;\"><strong>太可恶了，小小编教你怎么对付领导</strong><br></span></p><p><a href=\"http://static.oschina.net/uploads/space/2015/0720/171718_mi31_2359467.jpg\" target=\"_blank\"><img title=\"\" src=\"http://static.oschina.net/uploads/space/2015/0720/171718_mi31_2359467.jpg\" height=\"500\" width=\"300\" style=\"cursor: pointer;\"></a></p><p><span style=\"font-size: 14px;\"><strong>这鬼斧神工的画作一出，基本上就得下岗鸟。没关系，小小编给你介绍好工作。。</strong><br></span></p><p><a href=\"http://my.oschina.net/maimu\" target=\"_blank\" rel=\"nofollow\">@霡霂</a><span style=\"font-size: 14px;\">：年薪50万，工作很轻松。</span></p><p><a href=\"http://static.oschina.net/uploads/space/2015/0720/150705_dLJI_135555.jpg\" target=\"_blank\"><img title=\"\" alt=\"http://static.oschina.net/uploads/space/2015/0720/150705_dLJI_135555.jpg\" src=\"http://static.oschina.net/uploads/space/2015/0720/150705_dLJI_135555.jpg\" height=\"169\" width=\"300\" style=\"cursor: pointer;\"></a></p><p><span style=\"font-size: 14px;\"><strong>当然，如果哪天银行突然乱吐钱了，还真好让我们撞上了，那就真的可能不用工作了。</strong><br></span></p><p><a href=\"http://my.oschina.net/lahong\" target=\"_blank\" rel=\"nofollow\">@兰亭风语</a><span style=\"font-size: 14px;\">：一大爷在ATM机取400元吐出4000元，银行叫大爷还钱。之后银行收到这位大爷一封回信，内容如下</span></p><p><a href=\"http://static.oschina.net/uploads/space/2015/0720/151552_SYta_616610.png\" target=\"_blank\"><img title=\"\" alt=\"http://static.oschina.net/uploads/space/2015/0720/151552_SYta_616610.png\" src=\"http://static.oschina.net/uploads/space/2015/0720/151552_SYta_616610.png\" height=\"388\" width=\"400\" style=\"cursor: pointer;\"></a></p><p><span style=\"font-size: 14px;\"><strong>这是真事吗？这是在中国吗？不要骗我，在中国的话，大爷分分钟被抓去蹲号子啊！</strong></span></p><p><span style=\"font-size: 14px;\"><strong>像银行这种弱势群体真是惹不起，还是喷喷身边的同事好了。。</strong><br></span></p><p><a href=\"http://my.oschina.net/mrzhao\" target=\"_blank\" rel=\"nofollow\">@红山茶</a><span style=\"font-size: 14px;\">：旁边坐了一傻逼，整天他妈的唱歌，上班唱歌，真他妈奇葩&nbsp; <br></span></p><p><span style=\"font-size: 14px;\"><strong>如果是个妹子在唱歌，你还会骂人吗，估计你都伸长脖子偷瞄了人家了。。。</strong></span></p><p><a href=\"http://my.oschina.net/u/2295077\" target=\"_blank\" rel=\"nofollow\">@大意失贞操</a><span style=\"font-size: 14px;\">：两个妹子在网上看内裤，黑丝的而且还开档，是几个意思？这么个大妹子了还穿开裆裤，哈哈哈，笑死我了<br></span></p><p><a href=\"http://my.oschina.net/npxiaoqiang\" target=\"_blank\" rel=\"nofollow\">@np小强</a><span style=\"font-size: 14px;\">：搬家搬的连电脑都没了，关键是连妹纸都被隔断隔开了</span></p><p><a href=\"http://static.oschina.net/uploads/space/2015/0720/161341_tWYc_2359467.jpg\" target=\"_blank\"><img title=\"\" src=\"http://static.oschina.net/uploads/space/2015/0720/161341_tWYc_2359467.jpg\" height=\"301\" width=\"400\" style=\"cursor: pointer;\"></a></p><p><span style=\"font-size: 14px;\"><strong>这种工位太残忍了，世界上最遥远的距离，是妹子坐在你身旁，中间却有个隔板</strong></span></p><p><span style=\"font-size: 14px;\"><strong>说多了都是泪，小小编还是教你们几招实用的把妹技术吧，首先是要虔诚</strong></span></p><p><span style=\"font-size: 14px;\">我暗恋一女生，但是不敢表白。好不容易有个机会一起搭公交车，刚好我就坐在她旁边，我凝视倚着车窗的她，看见风轻轻拨弄她的发梢，好美。我鼓起勇气戴上耳机，小声地跟着音乐唱了首情歌。她也许听懂了我的心声，转过头来惊喜地问我：“原来你也信佛，喜欢念经啊！”<br></span></p><p><a href=\"http://my.oschina.net/lqzat2011\" target=\"_blank\" rel=\"nofollow\">@振哥哥</a><span style=\"font-size: 14px;\">：计算机相关的笑话</span></p><p><a href=\"http://static.oschina.net/uploads/space/2015/0720/170105_cBs4_2359467.jpg\" target=\"_blank\"><img title=\"\" src=\"http://static.oschina.net/uploads/space/2015/0720/170105_cBs4_2359467.jpg\" height=\"360\" width=\"400\" style=\"cursor: pointer;\"></a></p><p><span style=\"font-size: 14px;\"><strong>一句 hello world 就在一起了，这是笑话吗，这明明是年度励志大片，简直可以入选感动中国什么的！</strong></span></p><p><span style=\"font-size: 14px;\"><strong>所以，关键还是要勇敢地迈出第一步，就像下面的盆友<br></strong></span></p><p><span style=\"font-size: 14px;\">&nbsp;</span><a href=\"http://my.oschina.net/17zouguo\" target=\"_blank\" rel=\"nofollow\">蓝翔妓工</a><span style=\"font-size: 14px;\">：今天上班路上看到一特漂亮的小姑娘，便尾随其后，她貌似发现我在跟着她，就小跑了两步。\n" +
            "我心想，这种缘分如果不把握，可能会后悔终生的，我便追了上去，说：“美女，可以把你的电话给我吗？”\n" +
            "她颤抖着双手，拿着手机塞在我手上，就仓惶跑走了……&nbsp; <br></span></p><p><span style=\"font-size: 14px;\"><strong>或者足智多谋</strong><br></span></p><p><a href=\"http://my.oschina.net/disney\" target=\"_blank\" rel=\"nofollow\">Tuco-尘福</a><span style=\"font-size: 14px;\">：刚上小学的时候，知道厕所要分男女。女厕所不能进，就有一种神秘感。受好奇心的驱使，就想看看男女厕所有什么不同。于是就对同桌的女生说；“我的力气大，\n" +
            "我一个人可以把你们十个女生拉进男厕所。”女生不信，说：“把你拉进女厕所还差不多。”我说：“下课我们比一比。”“比就比。”下课后，她果然叫来9个女\n" +
            "生，一下子就把我拉进了女厕所.......有时候实现梦想真的需要一点手段。。。&nbsp; <br></span></p><p><span style=\"font-size: 14px;\"><strong>或者又土又豪</strong><br></span></p><p><a href=\"http://my.oschina.net/ztd\" target=\"_blank\" rel=\"nofollow\">@极品渣子</a><span style=\"font-size: 14px;\">：约吗？</span></p><p><a href=\"http://static.oschina.net/uploads/space/2015/0720/132303_Jdwy_149266.jpg\" target=\"_blank\"><img title=\"\" alt=\"http://static.oschina.net/uploads/space/2015/0720/132303_Jdwy_149266.jpg\" src=\"http://static.oschina.net/uploads/space/2015/0720/132303_Jdwy_149266.jpg\" height=\"580\" width=\"1028\" style=\"cursor: pointer;\"></a></p><p><span style=\"font-size: 14px;\"><strong>约还是不约，现在不好说，等晚上的彩票开奖后再答复你吧</strong></span></p><p><span style=\"font-size: 14px;\"><strong>最近动弹上有不好的苗头，经常朋友有花式秀恩爱<br></strong></span></p><p><a href=\"http://my.oschina.net/mishengqiang\" target=\"_blank\" rel=\"nofollow\">@小乔布斯</a><span style=\"font-size: 14px;\">：昨晚女友吃得太饱，把自己撑哭了，当时我憋着笑安慰她。</span></p><p><a href=\"http://my.oschina.net/wintelsui\" target=\"_blank\" rel=\"nofollow\">@工信部小五1_1</a><span style=\"font-size: 14px;\">：看到女盆友买了一本谭浩强的C语言,我真有点心疼她</span></p><p><span style=\"font-size: 14px;\"><strong><strong>是看女盆友买谭浩强的C语言，而你却只会心疼，你还是程序猿吗？</strong></strong></span></p><p><a href=\"http://static.oschina.net/uploads/space/2015/0720/182147_GIi5_2359467.jpg\" target=\"_blank\"><img src=\"http://static.oschina.net/uploads/space/2015/0720/182147_GIi5_2359467.jpg\" style=\"cursor: pointer;\"></a></p><p><a href=\"http://my.oschina.net/hks\" target=\"_blank\" rel=\"nofollow\">@鱼的记忆</a><span style=\"font-size: 14px;\">：今天打开电脑，网上全是王林被抓的消息。我想王林这些招摇撞骗真的不算什么！想当年我三岁就背唐诗，六岁即可熟读abc，九岁学完小学，十二完成义务教\n" +
            "育，高中钻研黑客，大学出各种软件，正是这些原因，才成就了我今天的辉煌。不说了，bug改完了休息会，一堆新需求正在来的路上。。。&nbsp;\t <br></span></p><p><a href=\"http://my.oschina.net/EvaKing\" target=\"_blank\" rel=\"nofollow\">@EvaKing</a><span style=\"font-size: 14px;\">：“锄禾日当午，码农好辛苦！需求日日新，也不见多金！想要更进步，赶紧找机会！”这是一位HR写给我的文案，我想说，HR为了招聘人才也是蛮拼的了。欢迎大家使用开源社区所有产品。你们懂得</span></p><p><a href=\"http://my.oschina.net/u/1770535\" target=\"_blank\" rel=\"nofollow\">@slimina</a><span style=\"font-size: 14px;\">：锄禾日当午，银子才靠谱，若为加班故，活着才不输。</span></p><p><span style=\"font-size: 14px;\"><strong>从前，有位程序猿不想上班，然后，就有了下面的故事</strong><br></span></p><p><a href=\"http://my.oschina.net/maimu\" target=\"_blank\" rel=\"nofollow\">霡霂</a><span style=\"font-size: 14px;\">：今天身体不适，请假在家休息，对老婆说：不管谁找我，就说我不在，随后我就睡了。突然电话响了，老婆接了电话说：我老公在家。我当时就发火，不是说谁找我都说我不在吗？老婆说：又不是找你的。于是我又扭头安心的睡了……&nbsp;\t <br></span></p><p><a href=\"http://my.oschina.net/u/1995201\" target=\"_blank\" rel=\"nofollow\">我讨厌很长很拉风名字</a><span style=\"font-size: 14px;\">：隔壁老王历险记！</span></p><p><a href=\"http://static.oschina.net/uploads/space/2015/0720/155916_pZhN_1995201.jpg\" target=\"_blank\"><img title=\"\" alt=\"http://static.oschina.net/uploads/space/2015/0720/155916_pZhN_1995201.jpg\" src=\"http://static.oschina.net/uploads/space/2015/0720/155916_pZhN_1995201.jpg\" height=\"346\" width=\"280\" style=\"cursor: pointer;\"></a></p><p><span style=\"font-size: 14px;\"><strong>当老王太辛苦了，小小编倡议，每一个老王都应该装备一副翅膀，</strong><br></span></p><p><a href=\"http://my.oschina.net/maimu\" target=\"_blank\" rel=\"nofollow\">霡霂</a><span style=\"font-size: 14px;\">：我一直有双隐形的翅膀</span></p><p><a href=\"http://static.oschina.net/uploads/space/2015/0720/163356_8m7O_2359467.jpg\" target=\"_blank\"><img src=\"http://static.oschina.net/uploads/space/2015/0720/163356_8m7O_2359467.jpg\" style=\"cursor: pointer;\"></a></p><p><span style=\"font-size: 14px;\"><strong>乱弹的最后，出道题考考大家</strong></span></p><p><a href=\"http://static.oschina.net/uploads/space/2015/0720/210124_2eSl_1428332.jpg\" target=\"_blank\"><img src=\"http://static.oschina.net/uploads/space/2015/0720/210124_2eSl_1428332.jpg\" width=\"300\" height=\"291\" title=\"\" style=\"cursor: pointer;\"></a></p><p><span style=\"display: none; line-height: 0px;\">\u200D</span><span style=\"font-size: 14px;\"><strong><strong><strong><strong>到底多少</strong>？</strong></strong></strong><strong><strong><span style=\"font-size: 16px;\"></span></strong><span style=\"display: none; line-height: 0px;\">\u200D</span>小小编智商余额已不足，求各位大神赐教！</strong><br></span></p><p><span style=\"font-size: 14px;\"><strong><br></strong></span></p><p><span style=\"font-size: 14px;\"></span></p><p style=\"padding: 0px; margin-top: 8px; margin-bottom: 8px; line-height: 22.5px; letter-spacing: 0.5px; color: rgb(51, 51, 51); white-space: normal; font-family: Verdana, sans-serif, 宋体; background-color: rgb(255, 255, 255);\"><span style=\"padding: 0px; margin: 0px; font-size: 14px;\"><strong>部分内容来自网络<br></strong></span></p><p style=\"padding: 0px; margin-top: 8px; margin-bottom: 8px; line-height: 22.5px; letter-spacing: 0.5px; color: rgb(51, 51, 51); white-space: normal; font-family: Verdana, sans-serif, 宋体; background-color: rgb(255, 255, 255);\"><span style=\"padding: 0px; margin: 0px; font-size: 14px;\"><strong>马上扫一扫下面的二维码，关注”开源中国“ 微信号！</strong></span></p><p><span style=\"padding: 0px; margin: 0px; font-size: 14px;\"><strong><a href=\"http://static.oschina.net/uploads/space/2013/0304/160442_8Fw6_179699.png\" target=\"_blank\" rel=\"nofollow\"><a href=\"http://static.oschina.net/uploads/space/2013/0304/160442_8Fw6_179699.png\" target=\"_blank\"><img src=\"http://static.oschina.net/uploads/space/2013/0304/160442_8Fw6_179699.png\" title=\"OSC微信二维码\" style=\"cursor: pointer;\"></a></a></strong></span><br><span style=\"font-size: 14px;\"><span style=\"padding: 0px; margin: 0px;\"><strong>（扫一扫，关注OSChina微信号，每天为你送上精选资讯早点，还有每天的 OSChina<strong>&nbsp;乱弹</strong>哦）</strong></span></span></p></div>";

    private String text2 = "<i class=\\\"pstatus\\\"> 本帖最后由 CS古月 于 2017-07-17 14:15 编辑 </i><br /><br /><p>>  \t  \" +\n" +
            "            \"这段时间经过多位龙空好友的建议反馈，龙的天空安卓版app终于要发布正式版本了，\" +\n" +
            "            \"在此先谢谢那些为这个app辛苦测试并提供多方建议的龙友们，感谢！  \" +\n" +
            "            \"</p>  <h3 style=\\\"color:blue; text-align:center\\\"><strong><span style=\"color:rgb(250,0,0);\">正式版V1.0.0功能介绍：</span></strong></h3>  <ul>  \t\" +\n" +
            "            \"<li><strong>首页帖子：</strong>对应龙空网站首页，分有信息流、主题、精华和热门列表；</li>  \t\" +\n" +
            "            \"<li><strong>版块：</strong>暂时有滑动和九空格两种模式，可以在界面右上角切换；</li>  \t<li><strong>消息：\" +\n" +
            "            \"</strong>可以查看评分、私信、通知及@我的所有消息；</li>  \t<li><strong>个人我的资料：\" +\n" +
            "            \"</strong>可以进行签到，查看主题、收藏、帖子、关注、粉丝及浏览历史资料，点击头像还<span style=\\\"color:rgb(255,0,0);\\\">\" +\n" +
            "            \"可以设置用户头像</span>、性别、头衔、个人介绍及<span style=\\\"color:rgb(0,200,255);\\\">小尾巴</span>内容；</li>  \" +\n" +
            "            \"\t<li><strong>搜索：</strong>可以进行帖子/用户/位面的搜索，\" +\n" +
            "            \"而且可以像网站一样进行热度、时间及相关度的排序选择，还能保存搜索历史；</li>  \t\" +\n" +
            "            \"<li><strong>回复评论及发帖：</strong>回复评论和发贴可以<strong><span style=\\\"color:rgb(255,0,0);\\\">\" +\n" +
            "            \"发表情图片</span></strong>，而且还可以像网站一样字体加粗斜体、分段及发超链接等；</li>  \" +\n" +
            "            \"\t<li><strong>帖子详情：</strong>除了帖子正常的样式外，还有评分、回复及编辑功能；而且还可以调整字体的大小，\" +\n" +
            "            \"分享帖子内容及选择用浏览器打开帖子；</li>  \t<li><strong><span style=\\\"color:rgb(84,141,212);\\\">优书网：\" +\n" +
            "            \"</span></strong>app还接入了优书网的内容，帖子内点击书名可以直接跳到优书网，\" +\n" +
            "            \"我的界面也可以进入优书网首页，<strong>优书网只要登录一次，则可以长期免登</strong>；</li>  <li><strong>设置：\" +\n" +
            "            \"</strong>可以切换日夜间模式，可以设置自动签到、清除缓存及版块显示模式；</li>  </ul>  <h4><strong>预定下一版功能：\" +\n" +
            "            \"</strong></h4>  <ul>  \t<li>版块列表区别关注和未关注版块；</li>  \t<li>多账号切换；</li>  \t<li>增加主题；</li>  \t\" +\n" +
            "            \"<li>优化消息提醒模式；</li>  \t<li>位面功能；</li>  </ul>  <p>  \t<strong><span \" +\n" +
            "            \"style=\\\"background-color:rgb(255,255,255);\\\">百度网盘下载地址：<a target=\\\"_blank\\\"href=\\\"https://pan.baidu.com/s/1hsACaRq\\\">\" +\n" +
            "            \"https://pan.baidu.com/s/1hsACaRq</a></span></strong>  </p>  <p>  \t<strong><span style=\\\"background-color: rgb(255, 255, 255);\\\">\" +\n" +
            "            \"蒲公英下载地址：<a target=\\\"_blank\\\"href=\\\"https://www.pgyer.com/1duS\\\">https://www.pgyer.com/1duS</a></span></strong>  </p>  <p> \" +\n" +
            "            \" \t<strong>各大市场因为需要账号申请及审核，可能要过两天才能在市场上看到下载。  </strong>  </p>  <p>  \t<strong><br>  \t</strong> \" +\n" +
            "            \" </p>  <p>  \t如果大家还有什么功能及建议想在之后的版块迭代中出现的，可以反馈给我，<strong><span style=\\\"color: rgb(255, 0, 0);\\\">\" +\n" +
            "            \"反馈Q群：650097719</span></strong><strong><br>  \t</strong>  </p> ";

    private String text3 = "<html><head><title>TextView使用HTML</title></head><body><p><strong>强调</strong></p><p><em>斜体</em></p>"
            + "<p><a href=\"http://www.dreamdu.com/xhtml/\">超链接HTML入门</a>学习HTML!</p><p><font color=\"#aabb00\">颜色1"
            + "</p><p><font color=\"#00bbaa\">颜色2</p><h1>标题1</h1><h3>标题2</h3><h6>标题3</h6><p>大于>小于<</p><p>" +
            "下面是网络图片</p><img src=\"http://static.oschina.net/uploads/space/2015/0720/172817_huYO_2359467.jpg\"/></body></html>";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selectable_text_view);

        et= (SelectedTextView) findViewById(R.id.et);

        et.setText(Html.fromHtml(text));
    }
}
