<?xml version="1.0"?>
<?mso-application progid="Excel.Sheet"?>
<Workbook xmlns="urn:schemas-microsoft-com:office:spreadsheet"
 xmlns:o="urn:schemas-microsoft-com:office:office"
 xmlns:x="urn:schemas-microsoft-com:office:excel"
 xmlns:ss="urn:schemas-microsoft-com:office:spreadsheet"
 xmlns:html="http://www.w3.org/TR/REC-html40">
 <DocumentProperties xmlns="urn:schemas-microsoft-com:office:office">
  <Author>Administrator</Author>
  <LastAuthor>Administrator</LastAuthor>
  <Created>2008-09-11T17:22:52Z</Created>
  <LastSaved>2018-08-15T05:51:18Z</LastSaved>
  <Version>12.00</Version>
 </DocumentProperties>
 <ExcelWorkbook xmlns="urn:schemas-microsoft-com:office:excel">
  <WindowHeight>5715</WindowHeight>
  <WindowWidth>12765</WindowWidth>
  <WindowTopX>0</WindowTopX>
  <WindowTopY>105</WindowTopY>
  <ProtectStructure>False</ProtectStructure>
  <ProtectWindows>False</ProtectWindows>
 </ExcelWorkbook>
 <Styles>
  <Style ss:ID="Default" ss:Name="Normal">
   <Alignment ss:Vertical="Bottom"/>
   <Borders/>
   <Font ss:FontName="Tahoma" x:Family="Swiss" ss:Size="11" ss:Color="#000000"/>
   <Interior/>
   <NumberFormat/>
   <Protection/>
  </Style>
  <Style ss:ID="m65189184">
   <Alignment ss:Horizontal="Center" ss:Vertical="Center" ss:WrapText="1"/>
   <Borders>
    <Border ss:Position="Bottom" ss:LineStyle="Continuous" ss:Weight="2"
     ss:Color="#D4D4D4"/>
    <Border ss:Position="Left" ss:LineStyle="Continuous" ss:Weight="2"
     ss:Color="#D4D4D4"/>
    <Border ss:Position="Right" ss:LineStyle="Continuous" ss:Weight="2"
     ss:Color="#D4D4D4"/>
    <Border ss:Position="Top" ss:LineStyle="Continuous" ss:Weight="2"
     ss:Color="#D4D4D4"/>
   </Borders>
   <Font ss:FontName="Simsun" x:CharSet="134" ss:Size="11" ss:Color="#000000"/>
  </Style>
  <Style ss:ID="s74">
   <Alignment ss:Horizontal="Left" ss:Vertical="Center" ss:WrapText="1"/>
   <Borders>
    <Border ss:Position="Bottom" ss:LineStyle="Continuous" ss:Weight="2"
     ss:Color="#D4D4D4"/>
    <Border ss:Position="Left" ss:LineStyle="Continuous" ss:Weight="2"
     ss:Color="#D4D4D4"/>
    <Border ss:Position="Right" ss:LineStyle="Continuous" ss:Weight="2"
     ss:Color="#D4D4D4"/>
    <Border ss:Position="Top" ss:LineStyle="Continuous" ss:Weight="2"
     ss:Color="#D4D4D4"/>
   </Borders>
   <Font ss:FontName="Simsun" x:CharSet="134" ss:Size="9" ss:Color="#000000"
    ss:Bold="1"/>
  </Style>
  <Style ss:ID="s78">
   <Alignment ss:Horizontal="Left" ss:Vertical="Center" ss:WrapText="1"/>
   <Borders>
    <Border ss:Position="Bottom" ss:LineStyle="Continuous" ss:Weight="2"
     ss:Color="#D4D4D4"/>
    <Border ss:Position="Left" ss:LineStyle="Continuous" ss:Weight="2"
     ss:Color="#D4D4D4"/>
    <Border ss:Position="Right" ss:LineStyle="Continuous" ss:Weight="2"
     ss:Color="#D4D4D4"/>
    <Border ss:Position="Top" ss:LineStyle="Continuous" ss:Weight="2"
     ss:Color="#D4D4D4"/>
   </Borders>
   <Font ss:FontName="Simsun" x:CharSet="134" ss:Size="11" ss:Color="#000000"/>
  </Style>
  <Style ss:ID="s93">
   <Alignment ss:Horizontal="Left" ss:Vertical="Bottom"/>
   <Borders>
    <Border ss:Position="Bottom" ss:LineStyle="Continuous" ss:Weight="2"
     ss:Color="#D4D4D4"/>
   </Borders>
   <Font ss:FontName="Simsun" x:CharSet="134" ss:Size="15" ss:Color="#333333"
    ss:Bold="1"/>
  </Style>
 </Styles>
 <Worksheet ss:Name="Sheet1">
  <Table ss:ExpandedColumnCount="7" ss:ExpandedRowCount="1000" x:FullColumns="1"
   x:FullRows="1" ss:DefaultColumnWidth="54" ss:DefaultRowHeight="14.25">
   <Column ss:AutoFitWidth="0" ss:Width="103.5" ss:Span="2"/>
   <Column ss:Index="4" ss:AutoFitWidth="0" ss:Width="166.5"/>
   <Column ss:AutoFitWidth="0" ss:Width="169.5"/>
   <Column ss:AutoFitWidth="0" ss:Width="103.5" ss:Span="1"/>
   <Row ss:Height="20.25">
    <Cell ss:MergeAcross="6" ss:StyleID="s93"><Data ss:Type="String">计划名称：${checkTask.checkPlan.name }</Data></Cell>
   </Row>
   <Row ss:AutoFitHeight="0" ss:Height="24.75">
    <Cell ss:MergeAcross="6" ss:StyleID="m65189184"><Data ss:Type="String">抽查主体：${checkTask.checkPlan.areaName}                检查方式：${checkTask.checkPlan.examinationWay }                             抽查时间：${checkTask.estimateExecuteTime?date}</Data></Cell>
   </Row>
   <Row ss:Height="15">
    <Cell ss:StyleID="s74"><Data ss:Type="String">序号</Data></Cell>
    <Cell ss:StyleID="s74"><Data ss:Type="String">企业名称</Data></Cell>
    <Cell ss:StyleID="s74"><Data ss:Type="String">企业地址</Data></Cell>
    <Cell ss:StyleID="s74"><Data ss:Type="String">选派人员</Data></Cell>
    <Cell ss:StyleID="s74"><Data ss:Type="String">抽查事项</Data></Cell>
    <Cell ss:StyleID="s74"><Data ss:Type="String">当前阶段</Data></Cell>
    <Cell ss:StyleID="s74"><Data ss:Type="String">完成情况</Data></Cell>
   </Row>
   <#list checkTask.taskItemList as taskItem>
   <Row ss:Height="27.75">
    <Cell ss:StyleID="s78"><Data ss:Type="String">${taskItem_index + 1}</Data></Cell>
    <Cell ss:StyleID="s78"><Data ss:Type="String">${taskItem.marketObject.name}</Data></Cell>
    <Cell ss:StyleID="s78"><Data ss:Type="String">${taskItem.marketObject.address!}</Data></Cell>
    <Cell ss:StyleID="s78"><Data ss:Type="String"><#list taskItem.inspectorList as inspector>${inspector.name} </#list></Data></Cell>
    <Cell ss:StyleID="s78"><Data ss:Type="String">${checkTask.checkPlan.checkItems}</Data></Cell>
    <Cell ss:StyleID="s78"><Data ss:Type="String"><#if (taskItem.stage < 4) >初查<#else>复查</#if></Data></Cell>
    <Cell ss:StyleID="s78"><Data ss:Type="String"><#if (taskItem.stage == 1 ||  taskItem.stage == 4) >未录入<#elseif (taskItem.stage == 2 ||  taskItem.stage == 5)>未审核<#else>已审核</#if></Data></Cell>
   </Row>
   </#list>
  </Table>
  <WorksheetOptions xmlns="urn:schemas-microsoft-com:office:excel">
   <PageSetup>
    <Header x:Margin="0.3"/>
    <Footer x:Margin="0.3"/>
    <PageMargins x:Bottom="0.75" x:Left="0.7" x:Right="0.7" x:Top="0.75"/>
   </PageSetup>
   <Print>
    <ValidPrinterInfo/>
    <PaperSizeIndex>9</PaperSizeIndex>
    <HorizontalResolution>600</HorizontalResolution>
    <VerticalResolution>600</VerticalResolution>
   </Print>
   <Selected/>
   <Panes>
    <Pane>
     <Number>3</Number>
     <ActiveRow>8</ActiveRow>
     <ActiveCol>4</ActiveCol>
    </Pane>
   </Panes>
   <ProtectObjects>False</ProtectObjects>
   <ProtectScenarios>False</ProtectScenarios>
  </WorksheetOptions>
 </Worksheet>
</Workbook>
