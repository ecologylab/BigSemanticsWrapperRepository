using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using ecologylab.semantics.generated.library.creative_work;

namespace ecologylabGeneratedSemantics.ecologylab.semantics.generated.library.creative_work
{
    public interface IAuthor<out CW> where CW : CreativeWork
    {
    }
}
