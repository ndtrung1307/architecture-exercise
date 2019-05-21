// 1/ The code that violates the principle.

class ReportManage{
	String content;
	...
    public void Export()
    {
         ExportManage exportManage =  new ExportManage();
         exportManage.exportToScreen(this.content);
    }
}


class ExportManage{
	public void exportToScreen(String reportContent){
		System.out.println(reportContent);
	}
}


//2/ The code to fix that violation.

class ReportManage{
	String content;
	ExportMethodHandler exportHandler;
	...


    public void setExportHandler(ExportMethodHandler handler)
    {
    	this.exportHandler =  handler;
    }

    public void Export()
    {
        exportHandler.export(this.content);
    }
}


interface ExportMethodHandler {
	public void export(String reportContent);
}

class exportToLog implements ExportMethodHandle{
	public void export(String reportContent){
		Logger logger = new Logger();
		logger.log(reportContent);
	}
}

class exportToScreen implements ExportMethodHandle{
	public void export(String reportContent){
		System.out.println(reportContent);
	}
}