package com.example.uploadlibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * @ProjectName: UploadLocalMaven
 * @Package: com.example.uploadlibrary
 * @ClassName: UploadUtils
 * @Description: java类作用描述
 * @Author: Jeffray
 * @CreateDate: 2019/5/22 11:52
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/5/22 11:52
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class UploadUtils {
    public static void showToast(Context mContext,String msg){
        Toast.makeText(mContext,msg,Toast.LENGTH_SHORT).show();
    }
}
