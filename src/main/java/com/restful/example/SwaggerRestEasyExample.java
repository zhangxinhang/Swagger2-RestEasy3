package com.restful.example;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Example;
import io.swagger.annotations.ExampleProperty;

/**
 * 
 * @author AMS
 *
 */

@Api(tags = { "SwaggerRestEasyExample" })
@ApiResponses(value = { @ApiResponse(code = 500, message = "has error", response = ErrorMessageBean.class),
		@ApiResponse(code = 401, message = "no auth") })
@Path(value = "/example")
@Produces("application/json;charset=UTF-8")
public class SwaggerRestEasyExample {
	final static String exampleStr = "{\"example_id\":\"例子ID，可不填1\",\"example_name\":\"例子名称\"}";

	// 请确认是否需要添加忽略。添加该代码后，该资源路径将不做Token验证

	@GET
	@ApiOperation(value = "通过ID获取实例对象", response = ExampleVO.class)
	@Path("/{exampleId}")
	public ExampleVO getExampleById(@ApiParam(value = "例子ID", required = true) @PathParam("exampleId") String exampleId)
			throws Exception {
		if (exampleId.equals("world")) {
			@SuppressWarnings("unused")
			int a = 1 / 0;
		}
		if (exampleId.equals("foo")) {
		}
		return new ExampleVO(exampleId, "hello wolrd !!!  Mr." + exampleId);
	}

	@POST
	@ApiOperation(value = "通过ID获取实例对象", response = ExampleVO[].class)
	@Path("/search")
	public List<ExampleVO> getExampleNameById(@ApiParam(value = "过滤条件", required = true) QueryBean<ExampleVO> query)
			throws Exception {
		List<ExampleVO> evos = new ArrayList<>();
		evos.add(new ExampleVO("hello11", "world11"));
		evos.add(new ExampleVO("hello22", "world22"));
		return evos;
	}

	@POST
	@Path("")
	@ApiOperation(value = "新增实体对象", response = ExampleVO.class)
	public MessageBean addExample(@ApiParam(value = "实体例子对象", examples = @Example(value = {
			@ExampleProperty(value = exampleStr) }) , required = true) ExampleVO examplevo) {
		return new MessageBean("success");
	}

	@POST
	@ApiOperation(value = "新增主子表", response = DynamicParamsBean.class)
	@Path("/AandB")
	public DynamicParamsBean<ExampleVO, ExampleBVO[]> addExampleAndB(
			@ApiParam(value = "主子表实体对象", required = true) DynamicParamsBean<ExampleVO, ExampleBVO[]> examplevo) {
		return examplevo;
	}

}
