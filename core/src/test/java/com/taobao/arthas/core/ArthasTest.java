package com.taobao.arthas.core;


import com.sun.tools.attach.VirtualMachine;
import com.sun.tools.attach.VirtualMachineDescriptor;
import org.junit.Test;

import java.util.List;

public class ArthasTest {


    @Test
    public void testVirtualMachineDescriptor() {

        List<VirtualMachineDescriptor> virtualMachineDescriptorList = VirtualMachine.list();
        System.out.println(virtualMachineDescriptorList.size());
        for (VirtualMachineDescriptor descriptor : virtualMachineDescriptorList) {
            System.out.println(descriptor.id() + " - " + descriptor.displayName() + " - " + descriptor.provider());
        }

    }

}
