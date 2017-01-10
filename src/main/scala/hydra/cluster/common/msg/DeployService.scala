package hydra.cluster.common.msg

/**
  * For HydraCommon
  * Created by TaoZhou(187225577@qq.com) on 30/10/2017. 
  */
object DeployService {

  final case class DeployReq(appconfigString: String)

  final case class UnDeployReq(appconfigString: String)

}
