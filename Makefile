# current working directory

GENERATED_DIRS = generated/library library/uva library/scholarlyPublication
DIRS = $(GENERATED_DIRS)
JAR_DIRS = $(GENERATED_DIRS:%=ecologylab/semantics/%)

EXTRA = ../ecologylabFundamental; ../ecologylabSemantics; ../ecologylabInteractive 

MAKE_DIR = ../../makefiles
include $(MAKE_DIR)/java.make

TARGET		= ecologylabGeneratedSemantics
